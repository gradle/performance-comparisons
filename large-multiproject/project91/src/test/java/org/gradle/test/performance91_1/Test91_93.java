package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_93 {
    private final Production91_93 production = new Production91_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}