package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_294 {
    private final Production91_294 production = new Production91_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}