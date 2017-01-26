package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_378 {
    private final Production53_378 production = new Production53_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}