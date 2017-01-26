package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_331 {
    private final Production19_331 production = new Production19_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}