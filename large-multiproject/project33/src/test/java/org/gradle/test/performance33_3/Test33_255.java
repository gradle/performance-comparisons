package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_255 {
    private final Production33_255 production = new Production33_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}