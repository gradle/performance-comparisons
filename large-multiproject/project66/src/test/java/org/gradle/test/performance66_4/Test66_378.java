package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_378 {
    private final Production66_378 production = new Production66_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}