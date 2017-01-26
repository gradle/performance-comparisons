package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_445 {
    private final Production19_445 production = new Production19_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}