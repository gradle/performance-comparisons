package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_378 {
    private final Production91_378 production = new Production91_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}