package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_378 {
    private final Production33_378 production = new Production33_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}