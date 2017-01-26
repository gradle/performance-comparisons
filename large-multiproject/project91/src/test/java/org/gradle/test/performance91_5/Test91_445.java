package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_445 {
    private final Production91_445 production = new Production91_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}