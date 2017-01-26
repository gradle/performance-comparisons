package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_49 {
    private final Production27_49 production = new Production27_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}