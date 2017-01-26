package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_255 {
    private final Production91_255 production = new Production91_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}