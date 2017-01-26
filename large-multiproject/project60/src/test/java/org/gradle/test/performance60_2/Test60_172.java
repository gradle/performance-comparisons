package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_172 {
    private final Production60_172 production = new Production60_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}