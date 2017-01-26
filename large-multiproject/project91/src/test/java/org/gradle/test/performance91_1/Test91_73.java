package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_73 {
    private final Production91_73 production = new Production91_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}