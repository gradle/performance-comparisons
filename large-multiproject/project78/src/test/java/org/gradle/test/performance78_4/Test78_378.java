package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_378 {
    private final Production78_378 production = new Production78_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}