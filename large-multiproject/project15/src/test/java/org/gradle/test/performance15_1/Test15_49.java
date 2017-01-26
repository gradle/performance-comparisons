package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_49 {
    private final Production15_49 production = new Production15_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}