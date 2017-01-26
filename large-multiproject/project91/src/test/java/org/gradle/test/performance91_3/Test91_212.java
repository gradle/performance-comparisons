package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_212 {
    private final Production91_212 production = new Production91_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}