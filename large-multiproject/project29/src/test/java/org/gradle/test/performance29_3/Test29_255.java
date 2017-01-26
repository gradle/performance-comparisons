package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_255 {
    private final Production29_255 production = new Production29_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}