package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_255 {
    private final Production34_255 production = new Production34_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}