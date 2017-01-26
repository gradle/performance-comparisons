package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_73 {
    private final Production99_73 production = new Production99_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}