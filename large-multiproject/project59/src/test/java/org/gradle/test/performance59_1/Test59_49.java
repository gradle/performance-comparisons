package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_49 {
    private final Production59_49 production = new Production59_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}