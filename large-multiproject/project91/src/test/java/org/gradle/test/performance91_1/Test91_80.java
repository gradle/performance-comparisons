package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_80 {
    private final Production91_80 production = new Production91_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}