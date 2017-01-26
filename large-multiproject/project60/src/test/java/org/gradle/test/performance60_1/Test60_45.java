package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_45 {
    private final Production60_45 production = new Production60_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}