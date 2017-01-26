package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_288 {
    private final Production59_288 production = new Production59_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}