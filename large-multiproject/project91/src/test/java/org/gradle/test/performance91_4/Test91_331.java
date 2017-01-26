package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_331 {
    private final Production91_331 production = new Production91_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}