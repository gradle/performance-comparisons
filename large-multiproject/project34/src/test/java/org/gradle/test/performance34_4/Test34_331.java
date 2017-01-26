package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_331 {
    private final Production34_331 production = new Production34_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}