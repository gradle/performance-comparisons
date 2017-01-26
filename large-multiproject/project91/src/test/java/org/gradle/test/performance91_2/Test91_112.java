package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_112 {
    private final Production91_112 production = new Production91_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}