package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_378 {
    private final Production76_378 production = new Production76_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}