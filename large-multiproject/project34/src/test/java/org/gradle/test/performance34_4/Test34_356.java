package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_356 {
    private final Production34_356 production = new Production34_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}