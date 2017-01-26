package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_49 {
    private final Production49_49 production = new Production49_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}