package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_378 {
    private final Production64_378 production = new Production64_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}