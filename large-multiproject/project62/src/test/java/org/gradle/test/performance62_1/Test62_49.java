package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_49 {
    private final Production62_49 production = new Production62_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}