package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_445 {
    private final Production59_445 production = new Production59_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}