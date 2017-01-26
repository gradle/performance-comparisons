package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_378 {
    private final Production23_378 production = new Production23_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}