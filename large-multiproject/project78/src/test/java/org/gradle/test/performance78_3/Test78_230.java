package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_230 {
    private final Production78_230 production = new Production78_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}