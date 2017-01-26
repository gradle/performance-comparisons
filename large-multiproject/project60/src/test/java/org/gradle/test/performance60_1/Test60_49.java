package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_49 {
    private final Production60_49 production = new Production60_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}