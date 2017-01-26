package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_445 {
    private final Production34_445 production = new Production34_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}