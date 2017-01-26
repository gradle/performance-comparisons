package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_88 {
    private final Production78_88 production = new Production78_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}