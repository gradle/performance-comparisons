package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_71 {
    private final Production60_71 production = new Production60_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}