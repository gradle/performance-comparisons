package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_49 {
    private final Production91_49 production = new Production91_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}