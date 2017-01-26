package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_331 {
    private final Production78_331 production = new Production78_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}