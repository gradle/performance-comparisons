package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_378 {
    private final Production68_378 production = new Production68_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}