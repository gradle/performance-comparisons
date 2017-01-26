package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_255 {
    private final Production59_255 production = new Production59_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}