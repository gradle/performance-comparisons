package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_378 {
    private final Production52_378 production = new Production52_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}