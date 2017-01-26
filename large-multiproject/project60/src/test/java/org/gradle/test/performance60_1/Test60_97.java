package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_97 {
    private final Production60_97 production = new Production60_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}