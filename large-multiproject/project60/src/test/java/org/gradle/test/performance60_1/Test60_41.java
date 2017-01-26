package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_41 {
    private final Production60_41 production = new Production60_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}