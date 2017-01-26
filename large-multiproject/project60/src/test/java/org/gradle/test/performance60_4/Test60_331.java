package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_331 {
    private final Production60_331 production = new Production60_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}