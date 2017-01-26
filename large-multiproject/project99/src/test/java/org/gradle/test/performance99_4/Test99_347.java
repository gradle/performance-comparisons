package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_347 {
    private final Production99_347 production = new Production99_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}