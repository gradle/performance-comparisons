package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_75 {
    private final Production34_75 production = new Production34_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}