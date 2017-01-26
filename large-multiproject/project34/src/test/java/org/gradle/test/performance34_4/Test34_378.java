package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_378 {
    private final Production34_378 production = new Production34_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}