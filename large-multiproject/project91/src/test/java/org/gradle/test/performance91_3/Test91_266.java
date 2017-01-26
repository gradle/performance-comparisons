package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_266 {
    private final Production91_266 production = new Production91_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}