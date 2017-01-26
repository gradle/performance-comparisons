package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_347 {
    private final Production60_347 production = new Production60_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}