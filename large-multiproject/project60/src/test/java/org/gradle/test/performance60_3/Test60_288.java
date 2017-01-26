package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_288 {
    private final Production60_288 production = new Production60_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}