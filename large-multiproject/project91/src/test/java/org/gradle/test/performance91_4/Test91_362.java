package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_362 {
    private final Production91_362 production = new Production91_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}