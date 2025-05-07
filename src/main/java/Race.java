public class Race {
    Car raceLeMan(Car[] carsLeMan) {
        int maxDistace = 0; // переменная будет хранить самую максимальную дистанцию из всех машин
        Car winnerLeMan = new Car(); // победитель
        for (int i=0; i < carsLeMan.length; i++) { // выбираем из массива машину с наибольшей дистанцией
            if ((carsLeMan[i].speed * 24) > maxDistace) {  // если текущая машина проехала больше за 24 часа, то делаем её победителем
                winnerLeMan = carsLeMan[i];
                maxDistace = carsLeMan[i].speed * 24;
            }
        }
        return winnerLeMan;
    }
}
