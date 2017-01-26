package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_378 {
    private final Production82_378 production = new Production82_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}