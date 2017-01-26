package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_267 {
    private final Production60_267 production = new Production60_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}